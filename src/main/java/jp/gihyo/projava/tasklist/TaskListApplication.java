package jp.gihyo.projava.tasklist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TaskListApplication {

    //ここがメインクラス　※メインクラスを実行することでアプリケーションが起動する
    public static void main(String[] args) {
        SpringApplication.run(TaskListApplication.class, args);
    }
}
