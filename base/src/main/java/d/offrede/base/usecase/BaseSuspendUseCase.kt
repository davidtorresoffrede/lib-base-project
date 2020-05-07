package d.offrede.base.usecase

abstract class BaseSuspendUseCase<Type, in Params> where Type : Any {
    abstract suspend fun run(params: Params): UseCaseResult<Type>
}