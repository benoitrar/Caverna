package hu.boardgamemodellers.caverna;

import com.google.common.base.Preconditions;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Amount {

    public static final Amount ZERO = ceiling(BigDecimal.ZERO);
    public static final Amount ONE = ceiling(BigDecimal.ONE);
    public static final Amount TWO = ceiling(new BigDecimal("2"));
    public static final Amount THREE = ceiling(new BigDecimal("3"));

    private final BigDecimal amount;
    private final RoundingMode roundingMode;

    private Amount(BigDecimal amount, RoundingMode roundingMode) {
        Preconditions.checkNotNull(amount);
        Preconditions.checkNotNull(roundingMode);
        this.amount = amount;
        this.roundingMode = roundingMode;
    }

    public static Amount ceiling(BigDecimal amount) {
        return new Amount(amount, RoundingMode.CEILING);
    }

    public static Amount floor(BigDecimal amount) {
        return new Amount(amount, RoundingMode.FLOOR);
    }

    public BigDecimal getRoundedTotal() {
        return amount.setScale(0, roundingMode);
    }

    public Amount add(Amount that) {
        Preconditions.checkArgument(this.roundingMode == that.roundingMode);
        return new Amount(amount.add(that.amount), roundingMode);
    }
}
