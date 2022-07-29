package com.example.whybackend;

import co.elastic.clients.elasticsearch.core.CreateResponse;
import co.elastic.clients.elasticsearch.core.DeleteResponse;
import co.elastic.clients.elasticsearch.core.GetResponse;
import co.elastic.clients.elasticsearch.core.SearchResponse;
import co.elastic.clients.elasticsearch.core.search.Hit;
import co.elastic.clients.elasticsearch.indices.CreateIndexRequest;
import co.elastic.clients.elasticsearch.indices.CreateIndexResponse;
import co.elastic.clients.elasticsearch.indices.DeleteIndexResponse;
import org.junit.jupiter.api.Test;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.whybackend.elasticsearchclient.ElasticSearchConfig;
import java.io.File;
import co.elastic.clients.elasticsearch.ElasticsearchClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class WhyBackendApplicationTests {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
        System.out.println("2333");
    }
    @Test
    void contextLoads() {
    }

    @Test
    void esCreateIndex() throws IOException{
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();
        // 创建索引
        CreateIndexResponse createIndexResponse = client.indices().create(c -> c.index("question"));
        System.out.println(createIndexResponse.acknowledged());
// 打印结果
    }

    @Test
    void esGetIndex() throws IOException{
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();
        // 创建索引
        CreateIndexResponse createIndexResponse = client.indices().create(c -> c.index("question"));
        System.out.println(createIndexResponse.acknowledged());
// 打印结果
    }

    @Test
    void esDeleteIndex() throws IOException{
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();
        // 删除索引
        DeleteIndexResponse createIndexResponse = client.indices().delete(c -> c.index("question"));
        System.out.println(createIndexResponse.acknowledged());
// 打印结果
    }

    @Test
    void esCreateDoc() throws IOException{
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();

        Question q = new Question();
        q.Id = 3;
        q.Answer = "23333";
        q.Title = "佩罗西";

// 构建一个创建Doc的请求
        CreateResponse createResponse = client.create(e->e.index("question").id("3").document(q));
// 打印请求结果
        System.out.println(createResponse.result());
// 打印结果
    }

    @Test
    void esGetDoc() throws IOException{
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();
        // 构建查询请求
        GetResponse<Question> response = client.get(e -> e.index("question").id("3"), Question.class);

// 打印查询结果
        System.out.println(response.source().toString());
    }



    @Test
    void esSearchDoc() throws IOException{
        ElasticSearchConfig cfg = new ElasticSearchConfig();
        ElasticsearchClient client = cfg.getClient();

        SearchResponse<Question> search = client.search(s -> s
                        .index("question")
                        .query(q -> q
                                .match(t -> t
                                        .field("Title")
                                        .query("佩罗西")
                                )
                        ),
                Question.class);
        System.out.println("0");
//        Object hits = search.hits().hits();
        ArrayList<Question> ar = new ArrayList<>();
        for (Hit<Question> hit: search.hits().hits()) {
            ar.add(hit.source());
        }
        System.out.println("0");
    }
}
