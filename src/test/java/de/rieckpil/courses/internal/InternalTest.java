package de.rieckpil.courses.internal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// mockito simple lib demo - https://github.com/ggorali-elsevier/mocky
// blog post - https://medium.com/@gorali/how-mockito-works-7d3a2c77da71
@ExtendWith(MockitoExtension.class)
public class InternalTest {

  public static class Util {
    public String greet() {
      return "Hello";
    }
  }

  @Mock
  private Util util;

  @Test
  public void normalMockingWorks() {
    Mockito.when(util.greet()).thenReturn("Mocked!");
    System.out.println(util.greet());
  }

  @Test
  public void returnTypeCannotMockedDirectly() {
    Mockito.when("hello i am a test").thenReturn("Mocked!");
    System.out.println(util.greet());
  }

  @Test
  public void butThisWorks() {
    util.greet();
    Mockito.when("hello i am a test").thenReturn("Mocked!");
    System.out.println(util.greet());
  }

}
