package gr.codehub.cicd.bootstrap;

import gr.codehub.cicd.service.DatabaseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SampleLoadTest {

    @Mock
    private DatabaseService dbServiceMock;

    @InjectMocks
    private SampleLoad sampleLoad;

    @Test
    void shouldSend10EmployeesToTheDatabase() {
        sampleLoad.loadSampleData();
        verify(dbServiceMock, atMostOnce()).clearDatabase();
        verify(dbServiceMock, times(10)).saveEmployee(any());
        verify(dbServiceMock, atLeast(5)).saveEmployee(any());
        verify(dbServiceMock, atLeastOnce()).saveEmployee(any());
    }
}
