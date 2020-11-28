package it.unibo.oop.lab.exception2;

import org.junit.Test;

/**
 * JUnit test to test
 * {@link StrictBankAccount}.
 * 
 */
public final class TestStrictBankAccount {

    /**
     * Used to test Exceptions on {@link StrictBankAccount}.
     */
    @Test
    public void testBankOperations() {
        /*
         * 1) Creare due StrictBankAccountImpl assegnati a due AccountHolder a
         * scelta, con ammontare iniziale pari a 10000 e nMaxATMTransactions=10
         */
    	AccountHolder s = new AccountHolder("Simone", "Albonetti", 1);
    	BankAccount simone = new StrictBankAccount(1, 10000, 10);
    	
    	AccountHolder a = new AccountHolder("Alessandro", "Albonetti", 2);
    	BankAccount alessandro = new StrictBankAccount(2, 10000, 10);
    	/*
         * 2) Effetture un numero di operazioni a piacere per verificare che le
         * eccezioni create vengano lanciate soltanto quando opportuno, cioè in
         * presenza di un id utente errato, oppure al superamento del numero di
         * operazioni ATM gratuite.
         */
    	/**
    	 * TransactionOverQuotaException
    	 */
    	for (int i = 0 ; i < 5 ; i++) {
    		simone.depositFromATM(1, 1);
    		System.out.println("Simone transaction done: "+ simone.getTransactionCount());
    		simone.withdrawFromATM(1, 1);
    		System.out.println("Simone transaction done: "+ simone.getTransactionCount());    	
    	}
    	try {
    		simone.depositFromATM(1, 1);
    	} catch (TransactionsOverQuotaException t) {
    		System.out.println(t.getMessage()); 
    	}
    	
    	/**
    	 * WrongAccounHolderException
    	 */
    	try {
    		alessandro.withdraw(1, 50);
    	} catch (WrongAccountHolderException w) {
    		System.out.println(w.getMessage());
    	}
    	
    	
    	/**
    	 * NotEnoughFoundsException
    	 */
    	try {
    		alessandro.withdraw(2, 50000);
    	} catch (NotEnoughFoundsException n) {
    		System.out.println(n.getMessage());
    	}   	    	
    }
}
