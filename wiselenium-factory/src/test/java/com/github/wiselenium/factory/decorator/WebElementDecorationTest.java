/**
 * Copyright (c) 2013 Andre Ricardo Schaffer
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.github.wiselenium.factory.decorator;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.wiselenium.element.DummyContainer;
import com.github.wiselenium.element.DummyField;
import com.github.wiselenium.element.DummyFrame;

@SuppressWarnings("javadoc")
public class WebElementDecorationTest {
	
	@Test
	public void shouldRecognizeTypeToDecorate() {
		WebElementDecorator decorator = new WebElementDecorator(null);
		assertTrue(decorator.shouldDecorate(WebElement.class));
		assertFalse(decorator.shouldDecorate(DummyFrame.class));
		assertFalse(decorator.shouldDecorate(DummyField.class));
		assertFalse(decorator.shouldDecorate(DummyContainer.class));
		assertFalse(decorator.shouldDecorate(Object.class));
	}
	
}