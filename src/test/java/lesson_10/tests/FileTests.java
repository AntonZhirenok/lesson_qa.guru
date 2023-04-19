package lesson_10.tests;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.opencsv.CSVReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class FileTests {

    private ClassLoader cl = FileTests.class.getClassLoader();

    /*@Test
    void zippedTest() throws Exception {
        try (InputStream is = cl.getResourceAsStream("lesson_10/myZipForLesson10.zip");
             ZipInputStream zis = new ZipInputStream(is)) {
            ZipEntry entry;

            while ((entry = zis.getNextEntry()) != null) {
                switch (Files.getFileExtension(entry.getName())) {
                    case "pdf" -> {
                        PDF pdf = new PDF(zis);
                        Assertions.assertEquals("SA",pdf.author);
                    }
                    case "xlsx" -> {
                        XLS xls = new XLS(zis);
                        Assertions.assertEquals(xls.excel.getSheetAt(0).getRow(3).getCell(2).getStringCellValue(), "Наименование регионального филиала");
                    }
                    case "csv" -> {
                        CSVReader reader = new CSVReader(new InputStreamReader(zis));
                        List<String[]> content = reader.readAll();
                        Assertions.assertArrayEquals(new String[]{"Жиренок", "Антон", "Александрович"}, content.get(1));
                    }
                }
            }
        }
    }

    @Test
    void jsonTest() throws Exception {

        ObjectMapper map = new ObjectMapper();

        try (InputStream is = cl.getResourceAsStream("lesson_10/desktop.json");
             InputStreamReader isr = new InputStreamReader(is)) {
            DesktopModel desktop = map.readValue(isr, DesktopModel.class);
            Assertions.assertEquals(1, desktop.screenSize);
            Assertions.assertEquals("ROG Strix G15 Gaming Desktop PC", desktop.name);
            Assertions.assertEquals("Windows", desktop.operatingSystem);
            Assertions.assertEquals("1TB", desktop.storageMemory);
            Assertions.assertEquals("16GB", desktop.ramMemory);
            Assertions.assertEquals("intel", desktop.CPUModel);
            Assertions.assertEquals("LG", desktop.screen.Brand);
            Assertions.assertEquals("23.8", desktop.screen.ScreenSize);
            Assertions.assertEquals("LG 24GN600-B UltraGear Gaming", desktop.screen.name);
            Assertions.assertEquals("Game", desktop.specifics.get(0));
        }
    }*/
}
