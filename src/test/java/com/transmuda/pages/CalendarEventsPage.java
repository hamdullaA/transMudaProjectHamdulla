package com.transmuda.pages;

import com.transmuda.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "//body/div[@id='page']/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/button[1]")
    public WebElement viewPerPageDropdown;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//li//a[@data-size='10']")
    public WebElement select10;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//li//a[@data-size='25']")
    public WebElement select25;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//li//a[@data-size='50']")
    public WebElement select50;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//li//a[@data-size='100']")
    public WebElement select100;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[1]/div[1]/div[4]/label[2]")
    public WebElement pages;

    @FindBy(xpath = "//label[@class='dib'][2]")
    public WebElement pageOf;

    @FindBy(xpath = "//label[@class='dib'][3]")
    public WebElement totalRecords;

    @FindBy(xpath = "//i[contains(text(),'Prev')]")
    public WebElement prev;

    @FindBy(xpath = "//i[contains(text(),'Next')]")
    public WebElement next;

    @FindBys({
            @FindBy(css = "tbody.grid-body > tr.grid-row")
    })
    public List<WebElement> rows;

    @FindBy(xpath = "//input[@data-grid-pagination-trigger-input]")
    public WebElement pageNumber;
}