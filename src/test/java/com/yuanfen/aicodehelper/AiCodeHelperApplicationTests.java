package com.yuanfen.aicodehelper;

import com.yuanfen.aicodehelper.ai.AiCodeHelper;
import dev.langchain4j.data.message.ImageContent;
import dev.langchain4j.data.message.TextContent;
import dev.langchain4j.data.message.UserMessage;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AiCodeHelperApplicationTests {
    @Resource
    private AiCodeHelper aiCodeHelper;
    @Test
    void contextLoads() {
    }

    @Test
    void chat() {
        aiCodeHelper.chat("你好，我是程序员缘分！");
    }

    //测试简单对话 - 自定义用户消息
    @Test
    void chatWithMessage() {
        UserMessage userMessage = UserMessage.from(
                TextContent.from("描述一个图片"),
                ImageContent.from("http://111.230.108.171/img/avatar.png")
        );
        aiCodeHelper.chatWithMessage(userMessage);
    }
}
