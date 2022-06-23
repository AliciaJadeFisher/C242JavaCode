package Exercises.AddressBookApp.dao;

import Exercises.AddressBookApp.dto.Address;
import Exercises.AddressBookApp.dto.AddressBookRecord;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookDaoFileImpl implements AddressBookDao
{

    private Map<Integer, AddressBookRecord> records = new HashMap<>();
    private final String ROSTER_FILE;
    public static final String DELIMITER = "::";

    public AddressBookDaoFileImpl()
    {
        ROSTER_FILE = "addressBook.txt";
    }

    public AddressBookDaoFileImpl(String rosterTextFile)
    {
        ROSTER_FILE = rosterTextFile;
    }

    @Override
    public AddressBookRecord addAddressBookRecord(AddressBookRecord record) throws AddressBookPersistenceException
    {
        loadBook();
        AddressBookRecord newRecord = records.put(records.size(), record);
        writeBook();
        return newRecord;
    }

    @Override
    public Map<Integer, AddressBookRecord> getAllRecords() throws AddressBookPersistenceException
    {
        loadBook();
        return records;
    }

    @Override
    public AddressBookRecord getRecord(Integer addressIndex) throws AddressBookPersistenceException
    {
        loadBook();
        return records.get(addressIndex);
    }

    @Override
    public AddressBookRecord removeAddress(Integer addressIndex) throws AddressBookPersistenceException
    {
        loadBook();
        AddressBookRecord removedRecord = records.remove(addressIndex);
        writeBook();
        return removedRecord;
    }

    @Override
    public Map<Integer, AddressBookRecord> searchRecord(String lastName) throws AddressBookPersistenceException
    {
        Map<Integer, AddressBookRecord> searchResults = new HashMap<>();
        int index = 0;
        loadBook();

        for(AddressBookRecord record : records.values())
        {
            if(record.getLastName().toLowerCase().equals(lastName.toLowerCase()))
            {
                searchResults.put(index,record);

                index++;
            }
        }

        return searchResults;
    }

    private AddressBookRecord unmarshallRecord(String recordAsText)
    {
        String[] recordTokens = recordAsText.split(DELIMITER);

        String firstName = recordTokens[0];
        String lastName = recordTokens[1];
        int number = Integer.parseInt(recordTokens[2]);
        String road = recordTokens[3];
        String city = recordTokens[4];
        String state = recordTokens[5];
        String postcode = recordTokens[6];

        return new AddressBookRecord(firstName, lastName, new Address(number, road, city, state, postcode));
    }

    private void loadBook() throws AddressBookPersistenceException
    {
        Scanner scanner;

        try {

            scanner = new Scanner(
                    new BufferedReader(
                            new FileReader(ROSTER_FILE)));
        } catch (FileNotFoundException e) {
            throw new AddressBookPersistenceException(
                    "-_- Could not load book data into memory.", e);
        }
        String currentLine;
        AddressBookRecord currentRecord;
        int index = 0;

        while (scanner.hasNextLine()) {
            currentLine = scanner.nextLine();
            currentRecord = unmarshallRecord(currentLine);
            records.put(index, currentRecord);

            index++;
        }
        scanner.close();
    }

    private String marshallStudent(AddressBookRecord record){
        String recordAsText = record.getFirstName() + DELIMITER;
        recordAsText += record.getLastName() + DELIMITER;
        recordAsText += record.getAddress().getNumber() + DELIMITER;
        recordAsText += record.getAddress().getRoad() + DELIMITER;
        recordAsText += record.getAddress().getCity()+ DELIMITER;
        recordAsText += record.getAddress().getState() + DELIMITER;
        recordAsText += record.getAddress().getPostcode();

        return recordAsText;
    }

    private void writeBook() throws AddressBookPersistenceException
    {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(ROSTER_FILE));
        } catch (IOException e) {
            throw new AddressBookPersistenceException(
                    "Could not save address data.", e);
        }
        String recordAsText;
        for (AddressBookRecord currentRecord : records.values()) {
            recordAsText = marshallStudent(currentRecord);
            out.println(recordAsText);
            out.flush();
        }
        out.close();
    }
}
