package frc.robot.data;

// This Enum stores values for all gamepad related inputs
// -1 indicates a imaginary or placeholder value
//Reference a value like so: ButtonMap.A.value

public enum ButtonMap
{
    A(1),
    B(2),
    X(3),
    Y(4),
    LB(5),
    RB(6),
    BACK(7),
    START(8),
    LSTICK(9),
    RSTICK(10),

    STICK_LEFTX(11), //The values 11, 12, 13, and 14 for the sticks are not important. What is important is that each of them are different.
    STICK_LEFTY(12),
    STICK_RIGHTX(13),
    STICK_RIGHTY(14);

    public int value;
    private ButtonMap(int _value)
    {
        this.value = _value;
    }
}