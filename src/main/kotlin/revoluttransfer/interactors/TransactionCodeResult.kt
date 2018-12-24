package revoluttransfer.interactors

enum class TransactionCodeResult {
    NOT_ENOUGH_MONEY,
    UPDATE_CONFLICT,
    ROLLBACK_CONFLICT,
    SUCCESS
}