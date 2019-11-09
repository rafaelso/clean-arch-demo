# Descrição
API REST para abertura, listagem e busca de solicitações

# API

## Abertura de Solicitações
POST /solicitacoes

{
    "descricao": ,
}

## Listagem de Solicitações

GET /solicitacoes

[
    {
        id: ,
        descricao: 
    },
    {
        id: ,
        descricao: 
    },
    ...
    {
        id: ,
        descricao: 
    }
]

## Busca de Solicitação por ID

GET /solicitacoes/{id}

{
    "id": ,
    "descricao": ,
    "situacao": ,
    "status": ,
}