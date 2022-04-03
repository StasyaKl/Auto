package ru.perekrestok;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class CollectShop {
    public static AuthPage authPage;
    public static ChooseProducts chooseProductsPage;
    public static WebDriver driver;

    /**
     * осуществление первоначальной настройки
     */
    @BeforeClass
    public static void setup() {
        //определение пути до драйвера и его настройка
        System.setProperty("webdriver.chrome.driver", "/Users/19480640/Downloads/chromedriver");
        //создание экземпляра драйвера
        driver = new ChromeDriver();
        authPage = new AuthPage(driver);
        chooseProductsPage = new ChooseProducts(driver);
        //окно разворачивается на полный экран
        driver.manage().window().maximize();
        //задержка на выполнение теста = 10 сек.
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //получение ссылки на страницу входа из файла настроек
        driver.get("https://www.perekrestok.ru/"); }
    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() {
        //получение доступа к методам класса LoginPage для взаимодействия с элементами страницы
        //значение login/password берутся из файла настроек по аналогии с chromedriver
        //и loginpage
        authPage.clickEnterAddress();
        //вводим логин
        authPage.inputAddress("г Москва, пр-кт Вернадского, д 21 к 1, кв 2");
        //нажимаем кнопку входа
        authPage.clickChoiceAddress();
        //нажимаем кнопку входа
        authPage.clickFindOk();

        //нажимаем на Каталог
        chooseProductsPage.entryMenu();
        //нажимаем на раздел Готовая еда
        chooseProductsPage.entrySection();
        //добавляем в корзину первый продукт
        chooseProductsPage.entryProductBasket1();
        //добавляем в корзину второй продукт
        chooseProductsPage.entryProductBasket2();
        //переходим в корзину
        chooseProductsPage.entryBasket();
    }
}