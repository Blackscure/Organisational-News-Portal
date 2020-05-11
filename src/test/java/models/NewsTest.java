package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NewsTest {
    News news = new News("Sammsung S11+", "Samsung leaks images of the upcoming s11+", 1);
    @Test
    public void getsInstanceOfNews() {
        assertEquals(true,news instanceof News);
    }
    @Test
    public void getsContent() {
        assertEquals("Sammsung S11+", news.getContent());
    }
    @Test
    public void getDescription() {
        assertEquals("Samsung leaks images of the upcoming s11+", news.getDescription());
    }
    @Test
    public void getsDepartmentId() {
        assertEquals(1, news.getDepartmentid());
    }
}
