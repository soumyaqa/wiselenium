package org.wiselenium.core.pagefactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.internal.WrapsDriver;
import org.openqa.selenium.support.ui.LoadableComponent;

/**
 * Basic implementation of a common Page. <br/>
 * Should be extended to reflect your own page services.
 * 
 * @author Andre Ricardo Schaffer
 * @param <T> The page type.
 * @since 0.0.1
 */
public class Page<T extends Page<T>> extends LoadableComponent<T> implements WrapsDriver {
	
	private WebDriver driver;
	
	
	/**
	 */
	public Page() {}
	
	/**
	 * @param driver The driver to be encapsulated within the page.
	 */
	public Page(WebDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Returns this page object in order to allow chain calls in a more fluent way.
	 * 
	 * @return This page object.
	 * @since 0.0.1
	 */
	@SuppressWarnings("unchecked")
	public T and() {
		return (T) this;
	}
	
	/**
	 * Executes a script on the page.
	 * 
	 * @param script The script to be executed.
	 * @return The result of the script.
	 * @since 0.0.1
	 */
	public Object executeScript(String script) {
		return ((JavascriptExecutor) this.getWrappedDriver()).executeScript(script);
	}
	
	/**
	 * Finds the first element within the current page using the given mechanism.
	 * 
	 * @param <E> The type of the element.
	 * @param clazz The class of the element.
	 * @param by The locating mechanism to use.
	 * @return The element found.
	 * @since 0.0.1
	 */
	public <E> List<E> findElement(Class<E> clazz, By by) {
		// TODO findElement
		return null;
	}
	
	/**
	 * Finds all elements within the current page using the given mechanism.
	 * 
	 * @param <E> The type of the elements.
	 * @param clazz The class of the elements.
	 * @param by The locating mechanism to use.
	 * @return A list of all elements found or an empty list if nothing matches.
	 * @since 0.0.1
	 */
	public <E> List<E> findElements(Class<E> clazz, By by) {
		// TODO findElements
		return null;
	}
	
	/**
	 * Loads a new web page in the current browser window using a HTTP GET operation.
	 * 
	 * @param url The URL to load. It is best to use a fully qualified URL.
	 * @return This page object.
	 * @since 0.0.1
	 */
	@SuppressWarnings("unchecked")
	public T get(String url) {
		this.getWrappedDriver().get(url);
		return (T) this;
	}
	
	/**
	 * Retrieves the current URL that the browser is looking at.
	 * 
	 * @return The current URL.
	 * @since 0.0.1
	 */
	public String getCurrentUrl() {
		return this.getWrappedDriver().getCurrentUrl();
	}
	
	/**
	 * Retrieves the source of the page rendered in the browser.
	 * 
	 * @return The source of the page.
	 * @since 0.0.1
	 */
	public String getPageSource() {
		return this.getWrappedDriver().getPageSource();
	}
	
	/**
	 * Retrieves the title of the current page.
	 * 
	 * @return The title of the current page, or null if one is not set.
	 * @since 0.0.1
	 */
	public String getTitle() {
		return this.getWrappedDriver().getTitle();
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public WebDriver getWrappedDriver() {
		return this.driver;
	}
	
	@Override
	protected void isLoaded() {}
	
	@Override
	protected void load() {}
	
}