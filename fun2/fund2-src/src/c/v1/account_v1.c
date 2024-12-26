#include "account_v1.h"
#include <stdlib.h>
#include <string.h>

Account *create_account(char *account_number, double initial_balance) 
{
    Account *acc = malloc(sizeof(Account));

    acc->account_number = malloc(strlen(account_number) + 1);
    strcpy((char *)acc->account_number, account_number);
    
    acc->balance = initial_balance;
    return acc;
}

void delete_account(Account *acc) 
{
    free((void *)acc->account_number);
    free(acc);
}

void deposit(Account *acc, double amount) 
{
    acc->balance += amount;
}

void withdraw(Account *acc, double amount) 
{
    acc->balance -= amount;
}

const char *get_account_number(Account *acc)
{
    return acc->account_number;
}

double get_balance(Account *acc)
{
    return acc->balance;
}