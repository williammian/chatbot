package br.com.wm.ecomart.chatbot.web.controller;

import br.com.wm.ecomart.chatbot.domain.service.ChatbotService;
import br.com.wm.ecomart.chatbot.web.dto.PerguntaDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.thymeleaf.engine.TemplateManager;

@Controller
@RequestMapping({"/", "chat"})
public class ChatController {

    private static final String PAGINA_CHAT = "chat";

    private ChatbotService service;

    public ChatController(ChatbotService service) {
        this.service = service;
    }

    @GetMapping
    public String carregarPaginaChatbot() {
        return PAGINA_CHAT;
    }

    @PostMapping
    @ResponseBody
    public String responderPergunta(@RequestBody PerguntaDto dto) {
        return service.responderPergunta(dto.pergunta());
    }

    @GetMapping("limpar")
    public String limparConversa() {
        return PAGINA_CHAT;
    }

}
