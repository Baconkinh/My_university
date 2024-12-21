#include <stdio.h>

typedef struct {
    const char *account_number;
    double balance;

} Account;

const char *get_account_number(Account *acc){
        return acc->account_number;

}

double get_balance(Account *acc){
    return acc->balance;
}

void deposit(Account *acc, double amount){
    acc->balance += amount;

}

void withdraw(Account *acc, double amount){
    acc->balance -= amount;

}

Account *create_account(char *account_number, double initial_balance){
    Account *acc = malloc(sizeof(Account));
    acc->account_number = malloc(strlen(account_number) + 1);
    strcpy(acc->account_number, account_number);
    acc->balance = initial_balance;
    return acc;
}

void delete_account(Account *acc){
    free(acc->account_number);
    free(acc);
}

int main(){
    Account *acc = create_account("1234-0001", 100.);
    printf("Account %s has been created with a balance of %.2f baht.\n",
    get_account_number(acc), get_balance(acc));
    deposit(acc, 500.);
    withdraw(acc, 400.);
    printf("Account %s now has a balance of %.2f baht.\n",
    get_account_number(acc), get_balance(acc));
    delete_account(acc);
    acc = NULL;
    return 0;

}
