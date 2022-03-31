package ru.perekrestok;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CollectShop {
    @Test
    public void CollectShop() throws InterruptedException {
        testCollectShop();
    }

    public static void testCollectShop() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 20 сек.
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //открываем сайт перекрестка
        driver.get("https://www.perekrestok.ru/");
        //нажимаем на кнопку Ввести адрес
        driver.findElement(By.xpath("//*[contains(text(), 'Ввести адрес')]/..")).click();
        //вводим адрес г Москва, пр-кт Вернадского, д 21 к 1, кв 2
        WebElement search = driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
        search.sendKeys("г Москва, пр-кт Вернадского, д 21 к 1, кв 2");
        WebElement adrs = driver.findElement(By.xpath("//*[@id=\"react-select-2-option-0\"]"));
        adrs.click();
        //нажимаем Ок
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div/div/div/div[2]/div[2]/div/div/button")).click();

        //открываем каталог
        driver.findElement(By.xpath("//*[contains(text(), 'Каталог')]/..")).click();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //выбираем раздел Готовая еда
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[3]/div[2]/div[6]/div/a/div/div")).click();

        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[4]/div/div[3]/div[3]/div[2]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"header-container\"]/div[1]/div[2]/div/div[5]/a")).click();
    }
}
