class No<T> {
  public final T dado;
  private No<T> prox;
  private No<T> anter;
	
    /* Cria um novo no. */
    public No(T dado2){
		this.dado = dado2;
		this.prox = null;
		this.anter = null;
    }
    /* Testa se existe um No apos esse no. */
    public boolean hasNext(){
		if(prox != null){
			return true;
		}
    	return false;
    }
    /* Testa se existe um No antes desse no. */
    public boolean hasPrevious(){
    	if(anter != null){
			return true;
		}
    	return false;
    }
    /* Retorna o próximo No. */
    public No next(){
    	return prox;
    }
    /* Retorna o No anterior. */
    public No previous(){
    	return anter;
    }
    public void setNext(No<T> prox){
    	this.prox = prox;
    }
    public void setPrevious(No<T> anter){
    	this.anter = anter;
    }
    /* Insere um No após esse no. */
       public void insertAfter(Object novo){
    	No node = new No(novo);
		if(node == null){
			throw new IllegalStateException("Erro");
		}
		if(hasPrevious()){
			anter.setNext(prox);
		}
		if(hasNext()){
			prox.setPrevious(anter);
		}
    }
    /* Insere um No antes desse no. */
    public void insertBefore(Object novo){
    	No node = new No(novo);
		if(node == null){
			throw new IllegalStateException("Erro");
		}
		if(hasPrevious()){
			anter.setNext(prox);
		}
		if(hasNext()){
			prox.setPrevious(anter);
		}
    }
    /* Remove o no */
    public void remove(){
    	if(hasPrevious()){
    		anter.setNext(prox);
    	}
    	if(hasNext()){
    		prox.setPrevious(anter);
    	}
    }
    /* Recupera o dado armazenado. */
    public Object getData(){
		return dado;
    }
}