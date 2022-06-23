package Exercises.AddressBookApp.dao;

import Exercises.AddressBookApp.dto.AddressBookRecord;

import java.util.Map;

public interface AddressBookDao
{
    AddressBookRecord addAddressBookRecord(AddressBookRecord record)
            throws AddressBookPersistenceException;

    Map<Integer, AddressBookRecord> getAllRecords()
            throws AddressBookPersistenceException;

    AddressBookRecord getRecord(Integer addressIndex)
            throws AddressBookPersistenceException;

    AddressBookRecord removeAddress(Integer addressIndex)
            throws AddressBookPersistenceException;

    Map<Integer, AddressBookRecord> searchRecord(String lastName)
            throws AddressBookPersistenceException;

}
