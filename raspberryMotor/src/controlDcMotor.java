import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.RaspiPin;

public class controlDcMotor {
    public static void main(String[] args) {
        final GpioController gpio = GpioFactory.getInstance();
        final GpioPinDigitalOutput pinA = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_04, "PinA");
        final GpioPinDigitalOutput pinB = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_05, "PinB");
        final GpioPinDigitalOutput pinE = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "PinE");
        pinA.high();

    }
}
