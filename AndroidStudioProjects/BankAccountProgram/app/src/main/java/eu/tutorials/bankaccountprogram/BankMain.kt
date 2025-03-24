package eu.tutorials.bankaccountprogram

fun main(){
    val dennisBankAccount = BankAccount("Dennis", 1338.20)

    dennisBankAccount.deposit(200.0)
    dennisBankAccount.withdraw(1200.0)
    dennisBankAccount.deposit(3000.0)
    dennisBankAccount.withdraw(2000.0)
    dennisBankAccount.withdraw(3333.15)
    dennisBankAccount.displayTransactionHistory()

    println("${dennisBankAccount.accountHolder}'s balance is ${dennisBankAccount.acctBalance()}")
}