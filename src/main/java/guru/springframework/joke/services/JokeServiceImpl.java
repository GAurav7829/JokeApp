package guru.springframework.joke.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {
	private final ChuckNorrisQuotes quotes;
	@Autowired
	public JokeServiceImpl(ChuckNorrisQuotes quotes) {
		super();
		this.quotes = quotes;
	}

	@Override
	public String getJoke() {
		return quotes.getRandomQuote();
	}

}
