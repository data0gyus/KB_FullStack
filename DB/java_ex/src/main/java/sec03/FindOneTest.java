package sec03;

import app.Database;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;
import static com.mongodb.client.model.Filters.eq;

public class FindOneTest {
    public static void main(String[] args) {
        MongoCollection<Document> collection = Database.getCollection("todo");

        // 존재하는 _id 작성
        String id = "68353e17b7204604bc5cecd8";

        // Filters.eq()
        Bson query = eq("_id", new ObjectId(id));

        // 조건을 만족하는 결과 중 1행(문서 1개)만 조회
        Document doc = collection.find(query).first();
        System.out.println("==> findByIdResult : " + doc);

        Database.close();
    }
}
