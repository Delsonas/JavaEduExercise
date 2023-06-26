package ru.edu;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import ru.edu.DocManager.DocManager;
import ru.edu.DocManager.DocManagerImpl;
import ru.edu.MenHolder.MenHolder;
import ru.edu.StorageOfRegNum.StorageOfRegNum;
import ru.edu.Factory.InDocFactory;
import ru.edu.Factory.OutDocFactory;
import ru.edu.Factory.TaskDocFactory;

import java.util.List;

@SpringBootTest(classes = {DocManagerImpl.class, InDocFactory.class, OutDocFactory.class, TaskDocFactory.class})
@RunWith(SpringRunner.class)
//@MockBeans(value = {@MockBean(value = MenHolder.class), @MockBean(value = StorageOfRegNum.class)})
public class DocManagerImplTest {
    @Autowired
    DocManager docManager;
    @MockBean
    MenHolder menHolderImpl;

    @Before
    public void setUp() throws Exception {
        Mockito.when(menHolderImpl.getPeople()).thenReturn(List.of("Василий Васильевич Васильев"));
    }

    @MockBean
    StorageOfRegNum storageOfRegNum;

    @Test
    public void notEmptyList() {
        List test = docManager.createDocs(5);
        Assert.assertNotNull(test);
        Assert.assertEquals(5, test.size());
    }

}