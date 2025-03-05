package edu.uoc.ds.adt.util;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CSVReader {

    public static CSVParser getCSVParser(String filePath) throws IOException {
        InputStream inputStream = CSVReader.class.getClassLoader().getResourceAsStream(filePath);
        if (inputStream == null) {
            throw new FileNotFoundException("Error al cargar el archivo: " + filePath);
        }

        return CSVParser.parse(
                new InputStreamReader(inputStream, StandardCharsets.UTF_8),
                CSVFormat.DEFAULT.builder()
                        .setDelimiter(',')
                        .setHeader()
                        .setSkipHeaderRecord(true)
                        .build()
        );
    }
}

