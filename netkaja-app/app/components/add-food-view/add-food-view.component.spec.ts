import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { AddFoodViewComponent } from './add-food-view.component';

describe('AddFoodViewComponent', () => {
  let component: AddFoodViewComponent;
  let fixture: ComponentFixture<AddFoodViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ AddFoodViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(AddFoodViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
