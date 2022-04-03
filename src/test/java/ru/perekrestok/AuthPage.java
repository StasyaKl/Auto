package ru.perekrestok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    public class AuthPage {
        /**
         * конструктор класса, занимающийся инициализацией полей класса
         */
        public WebDriver driver;
        public AuthPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            this.driver = driver; }
        /**
         * определение поля Ввести адрес
         */
        @FindBy(xpath = "//*[contains(text(), 'Ввести адрес')]/..")
        private WebElement enterAddress;
        /**
         * определение поля ввода
         */
        @FindBy(xpath = "//*[@id=\"react-select-2-input\"]")
        private WebElement loginAddress;
        /**
         * определение соответсвующего адреса
         */
        @FindBy(xpath = "//*[@id=\"react-select-2-option-0\"]")
        private WebElement choiceAddress;
        /**
         * определение соответсвующего адреса
         */
        @FindBy(xpath = "/html/body/div[9]/div/div/div/div/div/div[2]/div[2]/div/div/button")
        private WebElement findOk;
        /**
         * метод для выбора кнопки Ввечти адрес
         */
        public void clickEnterAddress() {
            enterAddress.click(); }
        /**
         * метод для
         */
        public void inputAddress(String passwd) {
            loginAddress.sendKeys(passwd); }
        /**
         * метод для
         */
        public void clickChoiceAddress() {
            choiceAddress.click(); }
        /**
         * метод для
         */
        public void clickFindOk() {
            findOk.click(); }
}
