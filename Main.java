// Script principal do laboratório de acessibilidade - PLAY/TODOS
document.addEventListener("DOMContentLoaded", () => {
    console.log("Laboratório de Acessibilidade PLAY/TODOS carregado com sucesso!");

    // Exemplo de interatividade para o modo de alto contraste
    const botaoContraste = document.getElementById("toggle-contrast");
    if (botaoContraste) {
        botaoContraste.addEventListener("click", () => {
            document.body.classList.toggle("high-contrast");
        });
    }
});
