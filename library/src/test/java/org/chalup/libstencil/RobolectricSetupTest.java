package org.chalup.libstencil;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import android.content.Intent;

/**
 * This test class ensures that robolectric is running correctly on your machine/build system/IDE.
 * All the specs included in this file should pass.
 * Feel free to add your own specs if you find some part of Robolectric not working correctly.
 */
@Config(emulateSdk = 18, manifest = "./src/main/AndroidManifest.xml")
@RunWith(RobolectricTestRunner.class)
public class RobolectricSetupTest {

  private static final String INTENT_KEY = "KEY";

  @Test
  public void shouldTestAndroidSdkComponent() throws Exception {
    Intent intent = new Intent();
    intent.putExtra(INTENT_KEY, "value");
    assertThat(intent.getStringExtra(INTENT_KEY)).isEqualTo("value");
  }

  @Test
  public void shouldTestWithMockito() throws Exception {
    Greeter mock = mock(Greeter.class);
    when(mock.hello()).thenReturn("Bla");
    assertThat(mock.hello()).isEqualTo("Bla");
    verify(mock, times(1)).hello();
  }
}
