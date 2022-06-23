package CodeAlongs.ClassRosterApp.service;

import CodeAlongs.ClassRosterApp.dao.ClassRosterAuditDao;
import CodeAlongs.ClassRosterApp.dao.ClassRosterPersistenceException;

public class ClassRosterAuditDaoStubImpl implements ClassRosterAuditDao
{
    @Override
    public void writeAuditEntry(String entry) throws ClassRosterPersistenceException
    {
        // do nothing...
    }
}
