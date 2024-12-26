#include "account_v2.h"
#include <stdlib.h>
#include <string.h>

Account *create_account(char *account_number, double initial_balance) 
{
    Account *acc = malloc(sizeof(Account));
    if (acc == NULL) 
        return NULL;

    acc->account_number = malloc(strlen(account_number) + 1);
    if (acc->account_number == NULL) {
        free(acc);
        return NULL;
    }
    strcpy((char *)acc->account_number, account_number);
    
    if (initial_balance > 0.) {
        acc->balance = initial_balance;
    } else {
        delete_account(acc);
        return NULL;
    }
    return acc;
}

void delete_account(Account *acc) 
{
    free((void *)acc->account_number);
    free(acc);
}

int deposit(Account *acc, double amount) 
{
    if (amount > 0.) {
        acc->balance += amount;   
        return 0;     
    } else {
        return -1;
    }
}

int withdraw(Account *acc, double amount) 
{
    if (amount > 0. && amount <= acc->balance) {
        acc->balance -= amount;
        return 0;
    } else {
        return -1;
    }
}

const char *get_account_number(Account *acc)
{
    return acc->account_number;
}

double get_balance(Account *acc)
{
    return acc->balance;
}