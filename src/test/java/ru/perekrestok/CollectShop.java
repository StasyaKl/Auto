package ru.perekrestok;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.util.concurrent.TimeUnit;

public class CollectShop {
    @Test
    public void CollectShop() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "/Users/aspnmrv/Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //открываем сайт перекрестка
        driver.get("https://www.perekrestok.ru/");
        //открываем каталог
        driver.findElement(By.xpath("//*[contains(text(), 'Каталог')]/..")).click();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //выбираем раздел Готовая еда
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[3]/div[2]/div[6]/div/a/div/div")).click();
        //выбираем продукт
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/div/button")).click();
        //г Москва, пр-кт Вернадского, д 21 к 1, кв 2
        driver.findElement(By.xpath("//span[text()='Выбрать адрес']")).click();
        WebElement search = driver.findElement(By.id("react-select-3-input"));
        search.click();
        search.sendKeys("г Москва, пр-кт Вернадского, д 21 к 1, кв 2");
    }
}
