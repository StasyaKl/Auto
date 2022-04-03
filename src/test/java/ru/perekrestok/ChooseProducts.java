package ru.perekrestok;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChooseProducts {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public ChooseProducts(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора каталога
     */
    @FindBy(xpath = "//*[contains(text(), 'Каталог')]/..")
    private WebElement userMenu;
    /**
     * определение локатора выбираем Готовая еда
     */
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div[3]/div[2]/div[6]/div/a/div/div")
    private WebElement chooseSection;
    /**
     * определение локатора находим первую карзину
     */
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[1]/div/div[3]/div[3]/div[2]/div/button")
    private WebElement findProductBasket1;
    /**
     * определение локатора находим вторую карзину
     */
    @FindBy(xpath = "//*[@id=\"app\"]/div/main/div/div/div/div[3]/div/div[1]/div/div/div[2]/div/div[4]/div/div[3]/div[3]/div[2]/div/button")
    private WebElement findProductBasket2;
    /**
     * определение локатора Карзина
     */
    @FindBy(xpath = "//*[@id=\"header-container\"]/div[1]/div[2]/div/div[5]/a")
    private WebElement findBasket;
    /**
     * метод для получения имени пользователя из меню пользователя
     */
    //public String getUserName() {
    // String userName = userMenu.getText();
    // return userName; }
    /**
     * метод для нажатия кнопки меню
     */
    public void entryMenu() {
        userMenu.click(); }
    /**
     * метод для нажатия кнопки Готовая еда
     */
    public void entrySection() {
        chooseSection.click(); }
    /**
     * метод для нажатия кнопки у продукта 1
     */
    public void entryProductBasket1() {
        findProductBasket1.click(); }
    /**
     * метод для нажатия кнопки у продукта 2
     */
    public void entryProductBasket2() {
        findProductBasket2.click(); }
    /**
     * метод для нажатия кнопки Корзины
     */
    public void entryBasket() {
        findBasket.click(); }
}
