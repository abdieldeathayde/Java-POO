package Colletions;

class Serie {
    private String nome;
    private String genero;
    private Integer tempoEisodio;

    public Serie(String nome, String genero, Integer tempoEisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEisodio = tempoEisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEisodio() {
        return tempoEisodio;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "[nome=" + nome + '\'' +
                ", genero=" + genero + '\'' +
                ", tempoEisodio=" + tempoEisodio + '}' + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + ((genero == null) ? 0 : genero.hashCode());
        result = prime * result + ((tempoEisodio == null) ? 0 : tempoEisodio.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (genero == null) {
            if (other.genero != null)
                return false;
        } else if (!genero.equals(other.genero))
            return false;
        if (tempoEisodio == null) {
            if (other.tempoEisodio != null)
                return false;
        } else if (!tempoEisodio.equals(other.tempoEisodio))
            return false;
        return true;
    }

    

}
