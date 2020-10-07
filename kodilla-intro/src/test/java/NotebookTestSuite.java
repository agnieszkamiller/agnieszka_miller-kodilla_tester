import junit.framework.TestCase;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class NotebookTestSuite{

    @Test
    public void testCheckPrice(){
        Notebook notebook = new Notebook(2, 1500, 2020);
        notebook.checkPrice();
    }
    @Test
    public void testCheckWight(){
        Notebook notebook = new Notebook(2, 1500, 2020);
        notebook.checkWeight();
    }

    @Test
    public void testCheckYear(){
        Notebook notebook = new Notebook(2, 1500, 2020);
        notebook.checkYear();
    }

    @Test
    public void testCheckAndPrice(){
        Notebook notebook = new Notebook(2, 1500, 2020);
        notebook.checkYearPrice();
    }
}