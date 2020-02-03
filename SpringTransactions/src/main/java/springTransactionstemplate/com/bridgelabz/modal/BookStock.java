package springTransactionstemplate.com.bridgelabz.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
@Table(name="BOOK_STOCKS_T")
public class BookStock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="STOCK_ID")
	private Integer stockId;
	
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="BOOK_STOCK")
	private Integer bookStock;

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getBookStock() {
		return bookStock;
	}

	public void setBookStock(Integer bookStock) {
		this.bookStock = bookStock;
	}
	
}
