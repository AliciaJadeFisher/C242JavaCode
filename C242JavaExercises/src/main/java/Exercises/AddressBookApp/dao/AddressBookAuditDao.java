package Exercises.AddressBookApp.dao;
public interface AddressBookAuditDao
{
    public void writeAuditEntry(String entry) throws AddressBookPersistenceException;
}
