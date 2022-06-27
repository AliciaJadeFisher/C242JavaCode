package Exercises.AddressBookApp.dao;

import Exercises.AddressBookApp.dto.Address;
import Exercises.AddressBookApp.dto.AddressBookRecord;
import org.junit.jupiter.api.*;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookDaoFileImplTest
{
    AddressBookDao testDao;

    public AddressBookDaoFileImplTest()
    {
    }

    @BeforeAll
    public static void setUpClass()
    {
    }

    @AfterAll
    public static void tearDownClass()
    {
    }

    @BeforeEach
    void setUp() throws Exception
    {
        String testFile = "testAddressBook.txt";
        new FileWriter(testFile);
        testDao = new AddressBookDaoFileImpl(testFile);
    }

    @AfterEach
    void tearDown()
    {
    }

    @Test
    public void testAddGetAddress() throws Exception
    {
        Address address = new Address(42, "Wallaby Way", "Sydney", "", "PS42");
        AddressBookRecord record = new AddressBookRecord("Peter", "Sherman", address);

        testDao.addAddressBookRecord(record);

        AddressBookRecord retrievedRecord = testDao.getRecord(0);

        assertEquals(record.getFirstName(), retrievedRecord.getFirstName(), "Checking record first name.");
        assertEquals(record.getLastName(), retrievedRecord.getLastName(), "Checking record last name.");
        assertEquals(record.getAddress().getNumber(), retrievedRecord.getAddress().getNumber(), "Checking record address number.");
        assertEquals(record.getAddress().getRoad(), retrievedRecord.getAddress().getRoad(), "Checking record address road.");
        assertEquals(record.getAddress().getCity(), retrievedRecord.getAddress().getCity(), "Checking record address city.");
        assertEquals(record.getAddress().getState(), retrievedRecord.getAddress().getState(), "Checking record address state.");
        assertEquals(record.getAddress().getPostcode(), retrievedRecord.getAddress().getPostcode(), "Checking record address postcode.");
    }

    @Test
    public void testAddGetAllStudents() throws Exception
    {
        Address firstAddress = new Address(42, "Wallaby Way", "Sydney", "n/a", "2005");
        AddressBookRecord firstRecord = new AddressBookRecord("Peter", "Sherman", firstAddress);

        Address secondAddress = new Address(4, "Privet Drive", "Little Whinging", "Surrey", "WD25 7FD");
        AddressBookRecord secondRecord = new AddressBookRecord("Vernon", "Dursley", secondAddress);
        testDao.addAddressBookRecord(firstRecord);
        testDao.addAddressBookRecord(secondRecord);

        HashMap<Integer, AddressBookRecord> records = (HashMap<Integer, AddressBookRecord>) testDao.getAllRecords();

        assertNotNull(records, "The list of records must not be null.");
        assertEquals(2, records.size(), "List of records should have 2 records.");
        assertTrue(records.get(0).getFirstName().equals(firstRecord.getFirstName()), "This list of records should contain Peter.");
        assertTrue(records.get(1).getFirstName().equals(secondRecord.getFirstName()), "This list of records should contain Vernon.");
    }

    @Test
    public void testRemoveStudent() throws Exception
    {
        Address firstAddress = new Address(42, "Wallaby Way", "Sydney", "n/a", "2005");
        AddressBookRecord firstRecord = new AddressBookRecord("Peter", "Sherman", firstAddress);

        Address secondAddress = new Address(4, "Privet Drive", "Little Whinging", "Surrey", "WD25 7FD");
        AddressBookRecord secondRecord = new AddressBookRecord("Vernon", "Dursley", secondAddress);
        testDao.addAddressBookRecord(firstRecord);
        testDao.addAddressBookRecord(secondRecord);

        AddressBookRecord removedRecord = testDao.removeAddress(0);
        assertEquals(removedRecord.getFirstName(), firstRecord.getFirstName(), "The removed record should be Peter");

        removedRecord = testDao.removeAddress(1);
        assertEquals(removedRecord.getFirstName(), secondRecord.getFirstName(), "The removed record should be Vernon");
    }

}