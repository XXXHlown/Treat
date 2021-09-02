package com.max.bracelet.braceletapi.dbunit.dao;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import com.github.springtestdbunit.annotation.ExpectedDatabase;
import com.github.springtestdbunit.assertion.DatabaseAssertionMode;
import com.max.bracelet.braceletapi.base.dataset.XlsDataSetLoader;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

@SpringBootTest
@TestExecutionListeners({
        TransactionalTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        DependencyInjectionTestExecutionListener.class,
        DbUnitTestExecutionListener.class
})
@DbUnitConfiguration(databaseConnection= {"dbUnitConnection"}, dataSetLoader = XlsDataSetLoader.class) //
@DisplayName("TesttestUnitApi")
public class TestTableInsertData {

    @Test
    @DatabaseSetup(type = DatabaseOperation.CLEAN_INSERT, value= {"/testcase/TesttestUnitApi/init_data01.xlsx"})
    @ExpectedDatabase(value="/testcase/TesttestUnitApi/expect_data01.xlsx", assertionMode = DatabaseAssertionMode.NON_STRICT)
    public void testDbInsertCleanAndException() {
        System.out.println("test execute!");
    }

    @Test
    @DatabaseSetup(type = DatabaseOperation.TRUNCATE_TABLE, value= {"/testcase/TesttestUnitApi/init_data01.xlsx"})
    public void testDbCleanOnly() {
        System.out.println("test execute!");
    }

    @Test
    @DatabaseSetup(type = DatabaseOperation.INSERT, value= {"/testcase/TesttestUnitApi/init_data01.xlsx"})
    public void testDbInsertOnly() {
        System.out.println("test execute!");
    }
}
