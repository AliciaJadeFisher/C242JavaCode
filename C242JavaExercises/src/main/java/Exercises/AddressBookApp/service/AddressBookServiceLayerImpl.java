package Exercises.AddressBookApp.service;

import Exercises.AddressBookApp.dao.AddressBookAuditDao;
import Exercises.AddressBookApp.dao.AddressBookDao;
import Exercises.AddressBookApp.dao.AddressBookPersistenceException;
import Exercises.AddressBookApp.dto.AddressBookRecord;

import java.util.Map;

public class AddressBookServiceLayerImpl implements AddressBookServiceLayer
{
    AddressBookDao dao;
    private AddressBookAuditDao auditDao;

    public AddressBookServiceLayerImpl(AddressBookDao dao, AddressBookAuditDao auditDao) {
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public void addAddress(AddressBookRecord record) throws AddressBookDataValidationException, AddressBookPersistenceException
    {
        validateRecordData(record);
        dao.addAddressBookRecord(record);
        auditDao.writeAuditEntry(
                "AddressRecord: " + record.getFirstName() + " " + record.getLastName() + " CREATED.");
    }

    @Override
    public Map<Integer, AddressBookRecord> getAllAddresses() throws AddressBookPersistenceException
    {
        return dao.getAllRecords();
    }

    @Override
    public AddressBookRecord getAddress(Integer recordId) throws AddressBookPersistenceException
    {
        return dao.getRecord(recordId);
    }

    @Override
    public AddressBookRecord removeAddress(Integer recordId) throws AddressBookPersistenceException
    {
        return dao.removeAddress(recordId);
    }

    @Override
    public Map<Integer, AddressBookRecord> searchRecord(String lastName) throws AddressBookPersistenceException
    {
        return dao.searchRecord(lastName);
    }

    private void validateRecordData(AddressBookRecord record) throws
            AddressBookDataValidationException
    {

        if ((record.getFirstName() == null)
                || (record.getFirstName().trim().length() == 0)
                || (record.getLastName() == null)
                || (record.getLastName().trim().length() == 0)
                || (record.getAddress().getNumber() == 0)
                || (record.getAddress().getRoad() == null)
                || (record.getAddress().getRoad().trim().length() == 0)
                || (record.getAddress().getCity() == null)
                || (record.getAddress().getCity().trim().length() == 0)
                || (record.getAddress().getState() == null)
                || (record.getAddress().getState().trim().length() == 0)
                || (record.getAddress().getPostcode() == null)
                || (record.getAddress().getPostcode().trim().length() == 0))
        {

            throw new AddressBookDataValidationException(
                    "ERROR: All fields [First Name, Last Name, House Number, " +
                            "Road Name, City Name, State Name, Postcode] are required.");
        }
    }
}
