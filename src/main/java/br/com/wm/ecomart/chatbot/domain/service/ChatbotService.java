package br.com.wm.ecomart.chatbot.domain.service;

import br.com.wm.ecomart.chatbot.infra.openai.DadosRequisicaoChatCompletion;
import br.com.wm.ecomart.chatbot.infra.openai.OpenAIClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatbotService {

    private final OpenAIClient client;

    public ChatbotService(OpenAIClient client) {
        this.client = client;
    }

    public String responderPergunta(String pergunta) {
        var promptSistema = "Você é um chatbot de atendimento a clientes de um e-commerce. Você não deve responder perguntas que não sejam dados do e-commerce informado! Além disso, acesse os arquivos associados a você e a thread para responder as perguntas.";
        var dados = new DadosRequisicaoChatCompletion(promptSistema, pergunta);
        return client.enviarRequisicaoChatCompletion(dados);
    }

    public List<String> carregarHistorico() {
        return client.carregarHistoricoDeMensagens();
    }

    public void limparHistorico() {
        client.apagarThread();
    }
}
