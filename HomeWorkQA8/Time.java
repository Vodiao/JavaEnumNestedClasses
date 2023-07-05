public enum Time {

    BREAKFAST ("Time to breakfast"),
    LAUNCH("Time to launch"),
    DINNER ("Time to dinner");

    final String time;

    Time(String time) {
        this.time = time;
    }

    public String getValue (){
        return time;
    }

/**
     * Создайте enum Time, напишите перечисление типа: BREAKFAST, LANCH, DINNER и задайте им какое-то значение, на ваш выбор,
     * например - Time to breakfast, в методе main придумайте условие через if или switch и выведете на экран
     */
}
