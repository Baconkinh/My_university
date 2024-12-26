#ifndef ACCOUNT_V1_H
#define ACCOUNT_V1_H

#include <stdio.h>

typedef struct {
    const char *account_number;
    double balance;
} Account;

Account * create_account(char *account_number, double initial_balance);
void delete_account(Account *acc);
int deposit(Account *acc, double amount);
int withdraw(Account *acc, double amount);
const char *get_account_number(Account *acc);
double get_balance(Account *acc);

#endif