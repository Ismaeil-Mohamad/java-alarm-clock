# Java Alarm Clock

A simple console alarm clock built with Java. The user enters a time (`HH:mm:ss`), and the alarm runs on a separate thread. When the time arrives, a sound plays in a loop until the user presses **Enter**.

## Features

- Set an alarm using the `HH:mm:ss` format
- Live clock display in the console
- Alarm sound (WAV) loops continuously until stopped
- Input validation with a retry on invalid format

## Concepts used

- Threads and `Runnable`
- `LocalTime` and `DateTimeFormatter`
- Exception handling
- Java Sound API (`Clip`, `AudioSystem`)
- Passing dependencies through constructors (`Scanner`)

## Requirements

- A recent JDK that supports the unnamed `void main()` method (Java 25, or Java 21+ with preview features enabled)
- A WAV audio file named `retro-alarm.wav` in the project root

## How to run

1. Clone the repository:
```bash
   git clone https://github.com/USERNAME/java-alarm-clock.git
```
2. Open the project in IntelliJ IDEA.
3. Run `Main.java`.
4. Enter the alarm time, for example `07:30:00`.
5. When the alarm rings, press **Enter** to stop it.

## Project structure

```
java-alarm-clock/
├── src/
│   ├── Main.java
│   └── AlarmClock.java
└── retro-alarm.wav
```

## Known limitations

- The alarm time must be later than the current time, otherwise it rings immediately.
- Only WAV files are supported.