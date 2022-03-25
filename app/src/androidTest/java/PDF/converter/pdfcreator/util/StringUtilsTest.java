package PDF.converter.pdfcreator.util;

import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import pdf.freePdf.newpdfcreator.util.StringUtils;

@RunWith(AndroidJUnit4.class)
public class StringUtilsTest {
    StringUtils stringUtils;

    @Before
    public void setup() {
        stringUtils = StringUtils.getInstance();
    }

    @Test
    public void isEmptyTest() {
        Assert.assertTrue(stringUtils.isEmpty(""));
    }

    @Test
    public void isNotEmptyTest() {
        Assert.assertTrue(stringUtils.isNotEmpty("Not empty"));
    }

    @Test
    public void getDefaultStorageLocationTest() {
        Assert.assertNotNull(stringUtils.getDefaultStorageLocation());
    }

    @Test
    public void parseIntOrDefaultTest() {
        Assert.assertEquals(stringUtils.parseIntOrDefault("25", 0), 25);
    }
}
