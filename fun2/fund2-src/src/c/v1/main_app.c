#include "account_v1.h"

int main() 
{
    Account *acc = create_account("1234-0001", 100.);

    // Illegal argument 
    // Account *acc = create_account("1234-0001", -100.);

    // Unavoidable invalid creation
    /*
    Account *acc = (Account *) malloc(sizeof(Account));
    acc->account_number = "1234-0002";
    acc->balance = -200;
    */
    printf("Account %s has been created with a balance of %.2f baht.\n",
        get_account_number(acc), get_balance(acc));

    deposit(acc, 500.);
    withdraw(acc, 400.);

    // overdrawn balance
    withdraw(acc, 800.);

    // unauthorized direct update
    // acc->account_number = "1234-0002";
    printf("Account %s has been created with a balance of %.2f baht.\n",
        get_account_number(acc), get_balance(acc));

    delete_account(acc);
    // Illegal access to dangling pointer
    printf("Deleted account %s had a balance of %.2f baht.\n", 
        get_account_number(acc), get_balance(acc));
    acc = NULL;
    // Access to NULL Pointer
    /*printf("Deleted account %s had a balance of %.2f baht.\n", 
        get_account_number(acc), get_balance(acc));*/
    return 0;
}