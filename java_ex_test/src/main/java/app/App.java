package app;

import app.domain.Todo;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class App {
    public static void main(String[] args) {
        // todo 컬렉션 추출
        MongoCollection<Todo> collection = Database.getCollection("todo", Todo.class);

        // 단일 insert
        Todo oneTodo = new Todo(null, "POJO Test", "POJO 테스트 확인하기", false);
        collection.insertOne(oneTodo);

        // 다중 insert
        List<Todo> manyTodo = Arrays.asList(
                new Todo(null, "POJO Test 1", "POJO 테스트 확인해보기 1", false),
                new Todo(null, "POJO Test 2", "POJO 테스트 확인해보기 2", false),
                new Todo(null, "POJO Test 3", "POJO 테스트 확인해보기 3", true),
                new Todo(null, "POJO Test 4", "POJO 테스트 확인해보기 4", true)
        );

        collection.insertMany(manyTodo);

        // 전체 todo 목록 출력
        List<Todo> todos = new ArrayList<>();
        collection.find().into(todos);

        for(Todo todo : todos){
            System.out.println(todo);
        }

        // 특정 id값 기반으로 검색 후 출력
        String id = "68356783db06e2b5a0b2823e";
        Bson query = eq("_id", new ObjectId(id));

        Todo todo = collection.find(query).first();
        System.out.println("==> findByIdResult : " + todo);

        Database.close();
    }
}
