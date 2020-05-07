package d.offrede.base.usecase

abstract class BaseUseCase<Type, in Params> where Type : Any {
    abstract fun run(params: Params): UseCaseResult<Type>
}