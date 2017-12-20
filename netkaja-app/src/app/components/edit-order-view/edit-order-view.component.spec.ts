import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditOrderViewComponent } from './edit-order-view.component';

describe('EditOrderViewComponent', () => {
  let component: EditOrderViewComponent;
  let fixture: ComponentFixture<EditOrderViewComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditOrderViewComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditOrderViewComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
