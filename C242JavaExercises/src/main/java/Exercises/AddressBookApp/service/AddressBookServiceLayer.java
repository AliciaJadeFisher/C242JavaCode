package Exercises.AddressBookApp.service;

import Exercises.AddressBookApp.dao.AddressBookPersistenceException;
import Exercises.AddressBookApp.dto.AddressBookRecord;

import java.util.Map;

public interface AddressBookServiceLayer
{
    void addAddress(AddressBookRecord record) throws
            AddressBookDataValidationException,
            AddressBookPersistenceException;

    Map<Integer, AddressBookRecord> getAllAddresses() throws
            AddressBookPersistenceException;

    AddressBookRecord getAddress(Integer recordId) throws
            AddressBookPersistenceException;

    AddressBookRecord removeAddress(Integer recordId) throws
            AddressBookPersistenceException;

    Map<Integer, AddressBookRecord> searchRecord(String lastName) throws
            AddressBookPersistenceException;
}
