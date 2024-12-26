#include "account_v2.h"

int main() 
{
    Account *acc = create_account("1234-0001", 100.);
    if (acc == NULL) {
        printf("Account creation failed. Aborted.");
        return 1;
    }

    printf("Account %s has been created with a balance of %.2f baht.\n",
        get_account_number(acc), get_balance(acc));

    deposit(acc, 500.);
    printf("Deposited 500 baht.");
    if (withdraw(acc, 400.) < 0) {
        printf("Insufficient balance.\n");
    } else {
        printf("Withdrawn 400 baht.\n");
    }
    if (withdraw(acc, 800.) < 0) {
        printf("Insufficient balance.\n");
    } else {
        printf("Withdrawn 800 baht.\n");
    }

    printf("Account %s now has a balance of %.2f baht.\n",
        get_account_number(acc), get_balance(acc));

    delete_account(acc);
    acc = NULL;
    return 0;
}