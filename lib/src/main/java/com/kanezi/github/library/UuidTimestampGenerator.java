/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.kanezi.github.library;

import java.time.LocalDate;
import java.util.UUID;

public class UuidTimestampGenerator {
    public static String generate() {
        return String.format("%s => %s", LocalDate.now(), UUID.randomUUID().toString());
    }
}